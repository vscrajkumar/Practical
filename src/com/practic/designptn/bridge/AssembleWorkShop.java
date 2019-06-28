package com.practic.designptn.bridge;

import java.util.concurrent.TimeUnit;

public class AssembleWorkShop extends WorkShop {

	@Override
	public void work(Vehicle vehicle) {
        System.out.print("Assembling... ");
        long timeToTake = 200 * vehicle.minWorkTime();
        try {
        TimeUnit.MILLISECONDS.sleep(timeToTake); // Thread.sleep(timeToTake);
        } catch (InterruptedException exp) {
        // nothing to do for now.
        } 
        System.out.printf("(Time taken: %d millis), Done.\n", timeToTake);
	}

}
