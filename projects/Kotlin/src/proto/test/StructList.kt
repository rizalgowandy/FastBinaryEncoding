// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.2.0.0

@file:Suppress("UnusedImport", "unused")

package test

import java.io.*
import java.lang.*
import java.lang.reflect.*
import java.math.*
import java.nio.charset.*
import java.time.*
import java.util.*

import fbe.*
import proto.*

@Suppress("MemberVisibilityCanBePrivate", "RemoveRedundantCallsOfConversionMethods")
open class StructList : Comparable<Any?>
{
    var f1: LinkedList<Byte> = LinkedList()
    var f2: LinkedList<Byte?> = LinkedList()
    var f3: LinkedList<ByteArray> = LinkedList()
    var f4: LinkedList<ByteArray?> = LinkedList()
    var f5: LinkedList<EnumSimple> = LinkedList()
    var f6: LinkedList<EnumSimple?> = LinkedList()
    var f7: LinkedList<FlagsSimple> = LinkedList()
    var f8: LinkedList<FlagsSimple?> = LinkedList()
    var f9: LinkedList<StructSimple> = LinkedList()
    var f10: LinkedList<StructSimple?> = LinkedList()

    constructor()

    constructor(f1: LinkedList<Byte>, f2: LinkedList<Byte?>, f3: LinkedList<ByteArray>, f4: LinkedList<ByteArray?>, f5: LinkedList<EnumSimple>, f6: LinkedList<EnumSimple?>, f7: LinkedList<FlagsSimple>, f8: LinkedList<FlagsSimple?>, f9: LinkedList<StructSimple>, f10: LinkedList<StructSimple?>)
    {
        this.f1 = f1
        this.f2 = f2
        this.f3 = f3
        this.f4 = f4
        this.f5 = f5
        this.f6 = f6
        this.f7 = f7
        this.f8 = f8
        this.f9 = f9
        this.f10 = f10
    }

    @Suppress("UNUSED_PARAMETER")
    constructor(other: StructList)
    {
        this.f1 = other.f1
        this.f2 = other.f2
        this.f3 = other.f3
        this.f4 = other.f4
        this.f5 = other.f5
        this.f6 = other.f6
        this.f7 = other.f7
        this.f8 = other.f8
        this.f9 = other.f9
        this.f10 = other.f10
    }

    open fun clone(): StructList
    {
        // Serialize the struct to the FBE stream
        val writer = test.fbe.StructListModel()
        writer.serialize(this)

        // Deserialize the struct from the FBE stream
        val reader = test.fbe.StructListModel()
        reader.attach(writer.buffer)
        return reader.deserialize()
    }

    override fun compareTo(other: Any?): Int
    {
        if (other == null)
            return -1

        if (!StructList::class.java.isAssignableFrom(other.javaClass))
            return -1

        @Suppress("UNUSED_VARIABLE")
        val obj = other as StructList? ?: return -1

        @Suppress("VARIABLE_WITH_REDUNDANT_INITIALIZER", "CanBeVal", "UnnecessaryVariable")
        var result = 0
        return result
    }

    override fun equals(other: Any?): Boolean
    {
        if (other == null)
            return false

        if (!StructList::class.java.isAssignableFrom(other.javaClass))
            return false

        @Suppress("UNUSED_VARIABLE")
        val obj = other as StructList? ?: return false

        return true
    }

    override fun hashCode(): Int
    {
        @Suppress("CanBeVal", "UnnecessaryVariable")
        var hash = 17
        return hash
    }

    override fun toString(): String
    {
        val sb = StringBuilder()
        sb.append("StructList(")
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append("f1=[").append(f1.size).append("]<")
            for (item in f1)
            {
                sb.append(if (first) "" else ",").append(item)
                first = false
            }
            sb.append(">")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f2=[").append(f2.size).append("]<")
            for (item in f2)
            {
                if (item != null) sb.append(if (first) "" else ",").append(item); else sb.append(if (first) "" else ",").append("null")
                first = false
            }
            sb.append(">")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f3=[").append(f3.size).append("]<")
            for (item in f3)
            {
                sb.append(if (first) "" else ",").append("bytes[").append(item.size).append("]")
                first = false
            }
            sb.append(">")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f4=[").append(f4.size).append("]<")
            for (item in f4)
            {
                if (item != null) sb.append(if (first) "" else ",").append("bytes[").append(item.size).append("]"); else sb.append(if (first) "" else ",").append("null")
                first = false
            }
            sb.append(">")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f5=[").append(f5.size).append("]<")
            for (item in f5)
            {
                sb.append(if (first) "" else ",").append(item)
                first = false
            }
            sb.append(">")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f6=[").append(f6.size).append("]<")
            for (item in f6)
            {
                if (item != null) sb.append(if (first) "" else ",").append(item); else sb.append(if (first) "" else ",").append("null")
                first = false
            }
            sb.append(">")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f7=[").append(f7.size).append("]<")
            for (item in f7)
            {
                sb.append(if (first) "" else ",").append(item)
                first = false
            }
            sb.append(">")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f8=[").append(f8.size).append("]<")
            for (item in f8)
            {
                if (item != null) sb.append(if (first) "" else ",").append(item); else sb.append(if (first) "" else ",").append("null")
                first = false
            }
            sb.append(">")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f9=[").append(f9.size).append("]<")
            for (item in f9)
            {
                sb.append(if (first) "" else ",").append(item)
                first = false
            }
            sb.append(">")
        }
        @Suppress("ConstantConditionIf")
        if (true)
        {
            var first = true
            sb.append(",f10=[").append(f10.size).append("]<")
            for (item in f10)
            {
                if (item != null) sb.append(if (first) "" else ",").append(item); else sb.append(if (first) "" else ",").append("null")
                first = false
            }
            sb.append(">")
        }
        sb.append(")")
        return sb.toString()
    }

    open fun toJson(): String = test.fbe.Json.engine.toJson(this)
    companion object
    {
        fun fromJson(json: String): StructList = test.fbe.Json.engine.fromJson(json, StructList::class.java)
    }
}
