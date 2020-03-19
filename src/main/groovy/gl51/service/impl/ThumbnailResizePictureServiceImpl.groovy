package gl51.service.impl

import gl51.data.Picture
import gl51.service.PictureService

import javax.inject.Inject

class ThumbnailResizePictureServiceImpl implements gl51.service.ResizePictureService {

    @Inject
    PictureService pictureService

    @Inject
    ApplyWatermarkServiceImpl applyWatermarkService

    @Override
    Picture getAndResize() {
        return null
    }
}
