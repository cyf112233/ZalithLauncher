package com.movtery.zalithlauncher.renderer.renderers

import com.movtery.zalithlauncher.renderer.RendererInterface

class VulkanZinkRenderer : RendererInterface {
    override fun getRendererId(): String = "vulkan_zink"

    override fun getUniqueIdentifier(): String = "0fa435e2-46df-45c9-906c-b29606aaef00"

    override fun getRendererName(): String = "Kopper Zink"

    override fun getRendererEnv(): Lazy<Map<String, String>> = lazy {
        mapOf(
            "GALLIUM_DRIVER" to "zink",
            "MESA_LOADER_DRIVER_OVERRIDE" to "zink",
            "POJAV_RENDERER" to "opengles3_desktopgl_zink_kopper",
            "LIBGL_ES" to "4",
            "MESA_GL_VERSION_OVERRIDE" to "4.6",
            "MESA_GLSL_VERSION_OVERRIDE" to "460",
            "force_glsl_extensions_warn" to "true",
            "allow_glsl_extension_directive_midshader" to "true",
            "allow_higher_compat_version" to "true",
            "LIB_MESA_NAME" to "libEGL_mesa.so",
            "vblank_mode" to "0",
            "radeonsi_disable_sync_shaders" to "1",
            "MESA_DEBUG" to "1",
            "ZINK_DEBUG" to "validate"
        )
    }

    override fun getDlopenLibrary(): Lazy<List<String>> = lazy {
        listOf(
            "libcutils.so",
            "libhardware.so", 
            "libsync.so",
            "libglxshim.so",
            "libgallium_dri.so",
            "libEGL_mesa.so",
            "libvulkan.so"
        )
    }

    override fun getRendererLibrary(): String = "libEGL_mesa.so"
}
