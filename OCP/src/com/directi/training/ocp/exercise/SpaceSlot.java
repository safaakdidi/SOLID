package com.directi.training.ocp.exercise;

public class SpaceSlot implements  Resource {
	
	
	private void markSpaceSlotFree(int resourceId)
    {
    }
	 private void markSpaceSlotBusy(int resourceId)
	    {
	    }

	    private int findFreeSpaceSlot()
	    {
	        return 0;
	    }
	    
	   

	@Override
	public int allocate() {
		 int resourceId = findFreeSpaceSlot();
         markSpaceSlotBusy(resourceId);
		return resourceId;
	}

	@Override
	public void free( int resourceId) {
		markSpaceSlotFree(resourceId);
		
	}
 
}
