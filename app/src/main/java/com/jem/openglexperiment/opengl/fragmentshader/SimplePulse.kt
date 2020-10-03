package com.jem.openglexperiment.opengl.fragmentshader

import android.content.res.Resources
import com.jem.openglexperiment.getStringFromAsset
import com.jem.openglexperiment.opengl.base.BaseFragmentShader

class SimplePulse(val resources: Resources) : BaseFragmentShader(resources) {
    override fun getFragmentShaderCode(resources: Resources): String {
        return resources.getStringFromAsset("simple_pulse.glsl")
    }

    override fun handleFragmentAttributes() {
    }
}