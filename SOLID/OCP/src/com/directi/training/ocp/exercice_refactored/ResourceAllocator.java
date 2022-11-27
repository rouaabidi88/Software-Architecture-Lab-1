package com.directi.training.ocp.exercice_refactored;

public class ResourceAllocator {

    public ResourceManager resourceManager;

    public int allocate(Resource resource)
    {
        int resourceId = resourceManager.findFree();
        if(resourceId)
        {
            resource.markBusy(resourceId);
            return resourceId;
        }
    }

    public void free(Resource resource, int resourceId)
    {
        resource.markFree(resourceId);
    }
}
