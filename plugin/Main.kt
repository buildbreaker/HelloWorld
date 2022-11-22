package buildbreaker.plugin

import buildbreaker.plugin.generator.Plugin

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            Plugin.run()
        }
    }
}