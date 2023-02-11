package com.directi.training.ocp.exercise;

public class ResourceAllocator
{
    
    private Resource res;

    public int allocate()
    {
        
        return this.res.allocate();
    }

    public void free( int resourceId)
    {
        this.res.free(resourceId);
    }

    
}
