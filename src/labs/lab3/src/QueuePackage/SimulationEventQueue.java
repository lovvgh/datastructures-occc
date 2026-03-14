package labs.lab3.src.QueuePackage;

import java.util.NoSuchElementException;

public class SimulationEventQueue implements SimulationEventQueueInterface {

    private double simulationTime;
    private VectorQueue<SimulationEvent> queueContents;

    public SimulationEventQueue() {
        queueContents = new VectorQueue<>();
        simulationTime = 0.0;
    }

    @Override
    public void add(SimulationEvent eventToAdd) {
        if (eventToAdd == null) {
            throw new IllegalArgumentException("Event to add cannot be null.");
        }

        if (eventToAdd.getTime() < simulationTime) {
            return;
        }

        VectorQueue<SimulationEvent> updatedQueue = new VectorQueue<>();
        boolean added = false;

        while (!queueContents.isEmpty()) {
            SimulationEvent nextEvent = queueContents.dequeue();

            if (!added && nextEvent.getTime() > eventToAdd.getTime()) {
                updatedQueue.enqueue(eventToAdd);
                added = true;
            }

            updatedQueue.enqueue(nextEvent);
        }

        if (!added) {
            updatedQueue.enqueue(eventToAdd);
        }

        queueContents = updatedQueue;
    }

    @Override
    public SimulationEvent remove() {
        SimulationEvent removed = null;
        if (isEmpty()) {
            throw new EmptyQueueException("Action cannot be performed on an empty queue");
        } else {
            removed = queueContents.dequeue();
            simulationTime = removed.getTime();
        }
        return removed;
    }

    @Override
    public SimulationEvent peek() {
        SimulationEvent next = null;
        if (isEmpty()) {
            throw new EmptyQueueException("Action cannot be performed on an empty queue");
        } else {
            next = queueContents.getFront();
        }
        return next;
    }

    @Override
    public boolean isEmpty() {
        return queueContents.isEmpty();
    }

    @Override
    public int getSize() {
        return queueContents.getSize();
    }

    @Override
    public void clear() {
        queueContents.clear();
    }

    @Override
    public double getCurrentTime() {
        return simulationTime;
    }
}
