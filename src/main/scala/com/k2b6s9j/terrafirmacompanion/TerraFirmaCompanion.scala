package com.k2b6s9j.terrafirmacompanion

import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.event.{FMLPostInitializationEvent, FMLInitializationEvent, FMLPreInitializationEvent}
import net.minecraftforge.common.config.Configuration
import org.apache.logging.log4j.Logger

@Mod(
  modid = "TFCompanion",
  name = "TerraFirmaCompanion",
  modLanguage = "scala",
  dependencies =
    "required-after:terrafirmacraft;" +
      "after:Botania")
object TerraFirmaCompanion {
  private[terrafirmacompanion] var log: Logger = null
  private[terrafirmacompanion] var config: Configuration = null

  @Mod.EventHandler
  def preInit(event: FMLPreInitializationEvent) = {
    log = event.getModLog
    printModInfo()
    ModCompatibility.preInit()
  }

  def printModInfo() = {
    log info "TerraFirmaCompanion"
    log info "Copyright Kepler Sticka-Jones 2014"
    log info "k2b6s9j.com/TerraFirmaCompanion"
  }

  @Mod.EventHandler
  def init(event: FMLInitializationEvent) = {
    ModCompatibility.init()
  }

  @Mod.EventHandler
  def postInit(event: FMLPostInitializationEvent) = {
    ModCompatibility.postInit()
  }
}
