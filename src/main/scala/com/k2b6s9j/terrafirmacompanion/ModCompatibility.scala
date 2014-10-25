package com.k2b6s9j.terrafirmacompanion

import cpw.mods.fml.common.Loader

object ModCompatibility {

  private val mods = Map[String, CompatibilityBase](
    "Botania" -> botania.Botania
  )

  def preInit() {
    mods.foreach {case (modId, compatClass) =>
      if(Loader.isModLoaded(modId)) {
        compatClass.preInit()
      }
    }
  }

  def init() {
    mods.foreach {case (modId, compatClass) =>
      if(Loader.isModLoaded(modId)) {
        compatClass.postInit()
      }
    }
  }

  def postInit() {
    mods.foreach {case (modId, compatClass) =>
      if(Loader.isModLoaded(modId)) {
        compatClass.postInit()
      }
    }
  }

}
