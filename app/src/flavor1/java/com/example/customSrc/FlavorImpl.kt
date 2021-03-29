package com.example.customSrc

class FlavorImpl : AbstractFlavor() {
    override fun getString() = StandardImpl().getString() + "_1"
}
