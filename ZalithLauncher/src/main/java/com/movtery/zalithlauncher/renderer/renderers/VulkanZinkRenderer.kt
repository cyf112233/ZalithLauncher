package com.movtery.zalithlauncher.renderer.renderers

import com.movtery.zalithlauncher.renderer.RendererInterface

class VulkanZinkRenderer : RendererInterface {
    override fun getRendererId(): String = "vulkan_zink"

    override fun getUniqueIdentifier(): String = "0fa435e2-46df-45c9-906c-b29606aaef00"

    override fun getRendererName(): String = "Kopper Zink"

    override fun getRendererEnv(): Lazy<Map<String, String>> = lazy {
        mapOf(
            "MESA_GL_VERSION_OVERRIDE" to "4.6",
            "MESA_GLSL_VERSION_OVERRIDE" to "460"
        )
    }

    override fun getDlopenLibrary(): Lazy<List<String>> = lazy {
        listOf(
            "libcutils.so",
            "libhardware.so", 
            "libsync.so",
            "libglxshim.so",
            "libgallium_dri.so",
            "libEGL_mesa.so"
        )
    }
    override fun getRendererLibrary(): String = "libEGL_mesa.so"
}
