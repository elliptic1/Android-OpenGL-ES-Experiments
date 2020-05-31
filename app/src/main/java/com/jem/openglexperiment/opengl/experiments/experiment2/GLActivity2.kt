package com.jem.openglexperiment.opengl.experiments.experiment2

import android.opengl.GLSurfaceView
import com.jem.openglexperiment.opengl.base.BaseGLActivity

class GLActivity2 : BaseGLActivity() {

    override fun getGLSurfaceViewInstance(): GLSurfaceView {
        return GLSurfaceView2(
            this
        )
    }

    override fun getSnackbarMessage(): String? {
        return "Drag to rotate."
    }
}