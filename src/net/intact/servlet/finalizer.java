package net.intact.servlet;

public class finalizer {
    @Override
    protected void finalize() throws Throwable {
    while (true) {
        Thread.yield();
    }

    }
}
