package com.directi.training.ocp.exercise;

public class TimeSlot implements Resource{
	
	private void markTimeSlotFree(int resourceId)
    {
    }
	
	private void markTimeSlotBusy(int resourceId)
    {
    }

    private int findFreeTimeSlot()
    {
        return 0;
    }

	@Override
	public int allocate() {
		 int resourceId = findFreeTimeSlot();
         markTimeSlotBusy(resourceId);
		return resourceId;
        
	}

	@Override
	public void free(int resourceId) {
		markTimeSlotFree(resourceId);
		
	}

}
