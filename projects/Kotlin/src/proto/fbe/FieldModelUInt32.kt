// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

@file:Suppress("UnusedImport", "unused")

package fbe

import java.io.*
import java.lang.*
import java.lang.reflect.*
import java.math.*
import java.nio.charset.*
import java.time.*
import java.util.*

// Fast Binary Encoding UInt field model class
class FieldModelUInt32(buffer: Buffer, offset: Long) : FieldModel(buffer, offset)
{
    // Field size
    override val fbeSize: Long = 4

    // Get the value
    fun get(defaults: UInt = 0u): UInt
    {
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return defaults

        return readUInt32(fbeOffset)
    }

    // Set the value
    fun set(value: UInt)
    {
        assert((_buffer.offset + fbeOffset + fbeSize) <= _buffer.size) { "Model is broken!" }
        if ((_buffer.offset + fbeOffset + fbeSize) > _buffer.size)
            return

        write(fbeOffset, value)
    }
}
