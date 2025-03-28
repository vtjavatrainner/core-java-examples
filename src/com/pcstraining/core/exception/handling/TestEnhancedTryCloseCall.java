package com.pcstraining.core.exception.handling;

public class TestEnhancedTryCloseCall implements AutoCloseable{

    public static void main(String[] args) {
        try (TestEnhancedTryCloseCall testEnhancedTryCloseCall = new TestEnhancedTryCloseCall()){
            System.out.println("in try block");
        } catch (Exception e) {
            System.out.println("in catch block");
            throw new RuntimeException(e);
        }
    }
    @Override
    public void close() throws Exception {
        System.out.println("closing TestFinallyClosableCall");
    }
}
