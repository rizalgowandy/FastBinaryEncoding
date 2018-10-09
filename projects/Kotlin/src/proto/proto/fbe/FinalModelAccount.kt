// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

@file:Suppress("UnusedImport", "unused")

package proto.fbe

import java.io.*
import java.lang.*
import java.lang.reflect.*
import java.math.*
import java.nio.charset.*
import java.time.*
import java.util.*

import fbe.*
import proto.*

// Fast Binary Encoding Account final model class
@Suppress("MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods", "ReplaceGetOrSet")
class FinalModelAccount(buffer: Buffer, offset: Long) : FinalModel(buffer, offset)
{
    val uid: FinalModelInt32 = FinalModelInt32(buffer, 0)
    val name: FinalModelString = FinalModelString(buffer, 0)
    val state: FinalModelState = FinalModelState(buffer, 0)
    val wallet: FinalModelBalance = FinalModelBalance(buffer, 0)
    val asset: FinalModelOptionalBalance = FinalModelOptionalBalance(buffer, 0)
    val orders: FinalModelVectorOrder = FinalModelVectorOrder(buffer, 0)

    // Get the allocation size
    fun fbeAllocationSize(fbeValue: Account): Long = (0
        + uid.fbeAllocationSize(fbeValue.uid)
        + name.fbeAllocationSize(fbeValue.name)
        + state.fbeAllocationSize(fbeValue.state)
        + wallet.fbeAllocationSize(fbeValue.wallet)
        + asset.fbeAllocationSize(fbeValue.asset)
        + orders.fbeAllocationSize(fbeValue.orders)
        )

    // Field type
    var fbeType: Long = fbeTypeConst

    companion object
    {
        const val fbeTypeConst: Long = 3
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

        uid.fbeOffset = fbeCurrentOffset
        fbeFieldSize = uid.verify()
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE
        fbeCurrentOffset += fbeFieldSize

        name.fbeOffset = fbeCurrentOffset
        fbeFieldSize = name.verify()
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE
        fbeCurrentOffset += fbeFieldSize

        state.fbeOffset = fbeCurrentOffset
        fbeFieldSize = state.verify()
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE
        fbeCurrentOffset += fbeFieldSize

        wallet.fbeOffset = fbeCurrentOffset
        fbeFieldSize = wallet.verify()
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE
        fbeCurrentOffset += fbeFieldSize

        asset.fbeOffset = fbeCurrentOffset
        fbeFieldSize = asset.verify()
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE
        fbeCurrentOffset += fbeFieldSize

        orders.fbeOffset = fbeCurrentOffset
        fbeFieldSize = orders.verify()
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE
        fbeCurrentOffset += fbeFieldSize

        return fbeCurrentOffset
    }

    // Get the struct value
    fun get(fbeSize: Size, fbeValue: Account = Account()): Account
    {
        _buffer.shift(fbeOffset)
        fbeSize.value = getFields(fbeValue)
        _buffer.unshift(fbeOffset)
        return fbeValue
    }

    // Get the struct fields values
    fun getFields(fbeValue: Account): Long
    {
        var fbeCurrentOffset = 0L
        var fbeCurrentSize = 0L
        val fbeFieldSize = Size(0)

        uid.fbeOffset = fbeCurrentOffset
        fbeValue.uid = uid.get(fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        name.fbeOffset = fbeCurrentOffset
        fbeValue.name = name.get(fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        state.fbeOffset = fbeCurrentOffset
        fbeValue.state = state.get(fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        wallet.fbeOffset = fbeCurrentOffset
        fbeValue.wallet = wallet.get(fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        asset.fbeOffset = fbeCurrentOffset
        fbeValue.asset = asset.get(fbeFieldSize)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        orders.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = orders.get(fbeValue.orders)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        return fbeCurrentSize
    }

    // Set the struct value
    fun set(fbeValue: Account): Long
    {
        _buffer.shift(fbeOffset)
        val fbeSize = setFields(fbeValue)
        _buffer.unshift(fbeOffset)
        return fbeSize
    }

    // Set the struct fields values
    fun setFields(fbeValue: Account): Long
    {
        var fbeCurrentOffset = 0L
        var fbeCurrentSize = 0L
        val fbeFieldSize = Size(0)

        uid.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = uid.set(fbeValue.uid)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        name.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = name.set(fbeValue.name)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        state.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = state.set(fbeValue.state)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        wallet.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = wallet.set(fbeValue.wallet)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        asset.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = asset.set(fbeValue.asset)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        orders.fbeOffset = fbeCurrentOffset
        fbeFieldSize.value = orders.set(fbeValue.orders)
        fbeCurrentOffset += fbeFieldSize.value
        fbeCurrentSize += fbeFieldSize.value

        return fbeCurrentSize
    }
}
