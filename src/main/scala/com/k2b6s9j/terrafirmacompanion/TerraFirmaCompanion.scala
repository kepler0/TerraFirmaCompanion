package com.k2b6s9j.terrafirmacompanion

import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.event.{FMLPostInitializationEvent, FMLInitializationEvent, FMLPreInitializationEvent}
import org.apache.logging.log4j.Logger

@Mod(modid = "TFCompanion", name = "TerraFirmaCompanion", modLanguage = "scala", dependencies = "required-after:terrafirmacraft")
object TerraFirmaCompanion {
  private var log: Logger = null

  @Mod.EventHandler
  def preInit(event: FMLPreInitializationEvent) = {
    log = event.getModLog
    printModInfo()
  }

  def printModInfo() = {
    log info "TerraFirmaCompanion"
    log info "Copyright Kepler Sticka-Jones 2014"
    log info "k2b6s9j.com/TerraFirmaCompanion"
  }

  @Mod.EventHandler
  def init(event: FMLInitializationEvent) = {

  }

  @Mod.EventHandler
  def postInit(event: FMLPostInitializationEvent) = {

  }
}
