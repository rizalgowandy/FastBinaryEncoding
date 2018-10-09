// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

@file:Suppress("UnusedImport", "unused")

package test.fbe

import java.io.*
import java.lang.*
import java.lang.reflect.*
import java.math.*
import java.nio.charset.*
import java.time.*
import java.util.*

import fbe.*
import test.*

// Fast Binary Encoding StructHashEx final model class
@Suppress("MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods", "ReplaceGetOrSet")
class FinalModelStructHashEx(buffer: Buffer, offset: Long) : FinalModel(buffer, offset)
{
    val f1: FinalModelMapStructSimpleStructNested = FinalModelMapStructSimpleStructNested(buffer, 0)
    val f2: FinalModelMapStructSimpleOptionalStructNested = FinalModelMapStructSimpleOptionalStructNested(buffer, 0)

    // Get the allocation size
    fun fbeAllocationSize(fbeValue: StructHashEx): Long = (0
        + f1.fbeAllocationSize(fbeValue.f1)
        + f2.fbeAllocationSize(fbeValue.f2)
        )

    // Field type
    var fbeType: Long = fbeTypeConst

    companion object
    {
        const val fbeTypeConst: Long = 142
    }

    // Check if the struct value is valid
    override fun verify(): Long
    {
        _buffer.shift(fbeOffset)
        val fbeResult = verifyFields()
        _buffer.unshift(fbeOffset)
        return fbeResult
    }

    // Check if the struct fields are valid
    fun verifyFields(): Long
    {
        var fbeCurrentOffset = 0L
        @Suppress("VARIABLE_WITH_REDUNDANT_INITIALIZER")
        var fbeFieldSize = 0L

        f1.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f1.verify()
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE
        fbeCurrentOffset += fbeFieldSize

        f2.fbeOffset = fbeCurrentOffset
        fbeFieldSize = f2.verify()
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE
        fbeCurrentOffset += fbeFieldSize

        return fbeCurrentOffset
    }

    // Get the struct value
    fun get(fbeSize: Size, fbeValue: StructHashEx = StructHashEx()): StructHashEx
    {
        _buffer.shift(fbeOffset)
        fbeSize.value = getFields(fbeValue)
        _buffer.unshift(fbeOffset)
        return fbeValue
    }

    // Get the struct fields values
    fun getFields(fbeValue: StructHashEx): Long
    {
        var fbeCurrentOffset = 0L
        var fbeCurrentSize = 0L
        val fbeFieldSize = Size(0)

        f1.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = f1.get(fbeValue.f1)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f2.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = f2.get(fbeValue.f2)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        return fbeCurrentSize
    }

    // Set the struct value
    fun set(fbeValue: StructHashEx): Long
    {
        _buffer.shift(fbeOffset)
        val fbeSize = setFields(fbeValue)
        _buffer.unshift(fbeOffset)
        return fbeSize
    }

    // Set the struct fields values
    fun setFields(fbeValue: StructHashEx): Long
    {
        var fbeCurrentOffset = 0L
        var fbeCurrentSize = 0L
        val fbeFieldSize = Size(0)

        f1.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = f1.set(fbeValue.f1)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        f2.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = f2.set(fbeValue.f2)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        return fbeCurrentSize
    }
}
