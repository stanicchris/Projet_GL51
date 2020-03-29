package gl51

import gl51.service.CloudAccessService
import gl51.service.ResizePictureService
import gl51.service.UpdateDatabaseService
import io.micronaut.runtime.Micronaut
import groovy.transform.CompileStatic

import javax.inject.Inject

@CompileStatic
class Application {
    static void main(String[] args) {
        Micronaut.run(Application)
    }

    @Inject
    UpdateDatabaseService updateDatabaseService

    @Inject
    CloudAccessService cloudAccessService

    @Inject
    ResizePictureService resizePictureService

    /*
        Some treatment to do...
    */
}