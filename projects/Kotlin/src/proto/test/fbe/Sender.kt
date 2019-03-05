// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.2.0.0

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

// Fast Binary Encoding test sender
@Suppress("MemberVisibilityCanBePrivate", "PropertyName")
open class Sender : fbe.Sender
{
    // Imported senders
    val protoSender: proto.fbe.Sender

    // Sender models accessors
    val StructSimpleModel: StructSimpleModel
    val StructOptionalModel: StructOptionalModel
    val StructNestedModel: StructNestedModel
    val StructBytesModel: StructBytesModel
    val StructArrayModel: StructArrayModel
    val StructVectorModel: StructVectorModel
    val StructListModel: StructListModel
    val StructSetModel: StructSetModel
    val StructMapModel: StructMapModel
    val StructHashModel: StructHashModel
    val StructHashExModel: StructHashExModel
    val StructEmptyModel: StructEmptyModel

    constructor() : super(false)
    {
        protoSender = proto.fbe.Sender(buffer)
        StructSimpleModel = StructSimpleModel(buffer)
        StructOptionalModel = StructOptionalModel(buffer)
        StructNestedModel = StructNestedModel(buffer)
        StructBytesModel = StructBytesModel(buffer)
        StructArrayModel = StructArrayModel(buffer)
        StructVectorModel = StructVectorModel(buffer)
        StructListModel = StructListModel(buffer)
        StructSetModel = StructSetModel(buffer)
        StructMapModel = StructMapModel(buffer)
        StructHashModel = StructHashModel(buffer)
        StructHashExModel = StructHashExModel(buffer)
        StructEmptyModel = StructEmptyModel(buffer)
    }

    constructor(buffer: Buffer) : super(buffer, false)
    {
        protoSender = proto.fbe.Sender(buffer)
        StructSimpleModel = StructSimpleModel(buffer)
        StructOptionalModel = StructOptionalModel(buffer)
        StructNestedModel = StructNestedModel(buffer)
        StructBytesModel = StructBytesModel(buffer)
        StructArrayModel = StructArrayModel(buffer)
        StructVectorModel = StructVectorModel(buffer)
        StructListModel = StructListModel(buffer)
        StructSetModel = StructSetModel(buffer)
        StructMapModel = StructMapModel(buffer)
        StructHashModel = StructHashModel(buffer)
        StructHashExModel = StructHashExModel(buffer)
        StructEmptyModel = StructEmptyModel(buffer)
    }

    fun send(value: test.StructSimple): Long
    {
        // Serialize the value into the FBE stream
        val serialized = StructSimpleModel.serialize(value)
        assert(serialized > 0) { "test.StructSimple serialization failed!" }
        assert(StructSimpleModel.verify()) { "test.StructSimple validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(serialized)
    }
    fun send(value: test.StructOptional): Long
    {
        // Serialize the value into the FBE stream
        val serialized = StructOptionalModel.serialize(value)
        assert(serialized > 0) { "test.StructOptional serialization failed!" }
        assert(StructOptionalModel.verify()) { "test.StructOptional validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(serialized)
    }
    fun send(value: test.StructNested): Long
    {
        // Serialize the value into the FBE stream
        val serialized = StructNestedModel.serialize(value)
        assert(serialized > 0) { "test.StructNested serialization failed!" }
        assert(StructNestedModel.verify()) { "test.StructNested validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(serialized)
    }
    fun send(value: test.StructBytes): Long
    {
        // Serialize the value into the FBE stream
        val serialized = StructBytesModel.serialize(value)
        assert(serialized > 0) { "test.StructBytes serialization failed!" }
        assert(StructBytesModel.verify()) { "test.StructBytes validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(serialized)
    }
    fun send(value: test.StructArray): Long
    {
        // Serialize the value into the FBE stream
        val serialized = StructArrayModel.serialize(value)
        assert(serialized > 0) { "test.StructArray serialization failed!" }
        assert(StructArrayModel.verify()) { "test.StructArray validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(serialized)
    }
    fun send(value: test.StructVector): Long
    {
        // Serialize the value into the FBE stream
        val serialized = StructVectorModel.serialize(value)
        assert(serialized > 0) { "test.StructVector serialization failed!" }
        assert(StructVectorModel.verify()) { "test.StructVector validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(serialized)
    }
    fun send(value: test.StructList): Long
    {
        // Serialize the value into the FBE stream
        val serialized = StructListModel.serialize(value)
        assert(serialized > 0) { "test.StructList serialization failed!" }
        assert(StructListModel.verify()) { "test.StructList validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(serialized)
    }
    fun send(value: test.StructSet): Long
    {
        // Serialize the value into the FBE stream
        val serialized = StructSetModel.serialize(value)
        assert(serialized > 0) { "test.StructSet serialization failed!" }
        assert(StructSetModel.verify()) { "test.StructSet validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(serialized)
    }
    fun send(value: test.StructMap): Long
    {
        // Serialize the value into the FBE stream
        val serialized = StructMapModel.serialize(value)
        assert(serialized > 0) { "test.StructMap serialization failed!" }
        assert(StructMapModel.verify()) { "test.StructMap validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(serialized)
    }
    fun send(value: test.StructHash): Long
    {
        // Serialize the value into the FBE stream
        val serialized = StructHashModel.serialize(value)
        assert(serialized > 0) { "test.StructHash serialization failed!" }
        assert(StructHashModel.verify()) { "test.StructHash validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(serialized)
    }
    fun send(value: test.StructHashEx): Long
    {
        // Serialize the value into the FBE stream
        val serialized = StructHashExModel.serialize(value)
        assert(serialized > 0) { "test.StructHashEx serialization failed!" }
        assert(StructHashExModel.verify()) { "test.StructHashEx validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(serialized)
    }
    fun send(value: test.StructEmpty): Long
    {
        // Serialize the value into the FBE stream
        val serialized = StructEmptyModel.serialize(value)
        assert(serialized > 0) { "test.StructEmpty serialization failed!" }
        assert(StructEmptyModel.verify()) { "test.StructEmpty validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(serialized)
    }

    // Send message handler
    override fun onSend(buffer: ByteArray, offset: Long, size: Long): Long { throw UnsupportedOperationException("test.fbe.Sender.onSend() not implemented!") }
}
