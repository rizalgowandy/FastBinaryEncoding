// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

package test.fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

import fbe.*;
import test.*;

// Fast Binary Encoding test receiver class
public class Receiver extends fbe.Receiver
{
    // Imported receivers
    public proto.fbe.Receiver protoReceiver;

    // Receiver values accessors
    private final test.StructSimple StructSimpleValue;
    private final test.StructOptional StructOptionalValue;
    private final test.StructNested StructNestedValue;
    private final test.StructBytes StructBytesValue;
    private final test.StructArray StructArrayValue;
    private final test.StructVector StructVectorValue;
    private final test.StructList StructListValue;
    private final test.StructSet StructSetValue;
    private final test.StructMap StructMapValue;
    private final test.StructHash StructHashValue;
    private final test.StructHashEx StructHashExValue;

    // Receiver models accessors
    private final StructSimpleModel StructSimpleModel;
    private final StructOptionalModel StructOptionalModel;
    private final StructNestedModel StructNestedModel;
    private final StructBytesModel StructBytesModel;
    private final StructArrayModel StructArrayModel;
    private final StructVectorModel StructVectorModel;
    private final StructListModel StructListModel;
    private final StructSetModel StructSetModel;
    private final StructMapModel StructMapModel;
    private final StructHashModel StructHashModel;
    private final StructHashExModel StructHashExModel;

    public Receiver()
    {
        protoReceiver = new proto.fbe.Receiver(getBuffer());
        StructSimpleValue = new test.StructSimple();
        StructSimpleModel = new StructSimpleModel();
        StructOptionalValue = new test.StructOptional();
        StructOptionalModel = new StructOptionalModel();
        StructNestedValue = new test.StructNested();
        StructNestedModel = new StructNestedModel();
        StructBytesValue = new test.StructBytes();
        StructBytesModel = new StructBytesModel();
        StructArrayValue = new test.StructArray();
        StructArrayModel = new StructArrayModel();
        StructVectorValue = new test.StructVector();
        StructVectorModel = new StructVectorModel();
        StructListValue = new test.StructList();
        StructListModel = new StructListModel();
        StructSetValue = new test.StructSet();
        StructSetModel = new StructSetModel();
        StructMapValue = new test.StructMap();
        StructMapModel = new StructMapModel();
        StructHashValue = new test.StructHash();
        StructHashModel = new StructHashModel();
        StructHashExValue = new test.StructHashEx();
        StructHashExModel = new StructHashExModel();
    }
    public Receiver(Buffer buffer)
    {
        super(buffer);
        protoReceiver = new proto.fbe.Receiver(getBuffer());
        StructSimpleValue = new test.StructSimple();
        StructSimpleModel = new StructSimpleModel();
        StructOptionalValue = new test.StructOptional();
        StructOptionalModel = new StructOptionalModel();
        StructNestedValue = new test.StructNested();
        StructNestedModel = new StructNestedModel();
        StructBytesValue = new test.StructBytes();
        StructBytesModel = new StructBytesModel();
        StructArrayValue = new test.StructArray();
        StructArrayModel = new StructArrayModel();
        StructVectorValue = new test.StructVector();
        StructVectorModel = new StructVectorModel();
        StructListValue = new test.StructList();
        StructListModel = new StructListModel();
        StructSetValue = new test.StructSet();
        StructSetModel = new StructSetModel();
        StructMapValue = new test.StructMap();
        StructMapModel = new StructMapModel();
        StructHashValue = new test.StructHash();
        StructHashModel = new StructHashModel();
        StructHashExValue = new test.StructHashEx();
        StructHashExModel = new StructHashExModel();
    }

    // Receive handlers
    protected void onReceive(test.StructSimple value) {}
    protected void onReceive(test.StructOptional value) {}
    protected void onReceive(test.StructNested value) {}
    protected void onReceive(test.StructBytes value) {}
    protected void onReceive(test.StructArray value) {}
    protected void onReceive(test.StructVector value) {}
    protected void onReceive(test.StructList value) {}
    protected void onReceive(test.StructSet value) {}
    protected void onReceive(test.StructMap value) {}
    protected void onReceive(test.StructHash value) {}
    protected void onReceive(test.StructHashEx value) {}

    @Override
    public boolean onReceive(long type, byte[] buffer, long offset, long size)
    {
        switch ((int)type)
        {
            case (int)test.fbe.StructSimpleModel.fbeTypeConst:
            {
                // Deserialize the value from the FBE stream
                StructSimpleModel.attach(buffer, offset);
                assert StructSimpleModel.verify() : "test.StructSimple validation failed!";
                long deserialized = StructSimpleModel.deserialize(StructSimpleValue);
                assert (deserialized > 0) : "test.StructSimple deserialization failed!";

                // Log the value
                if (getLogging())
                {
                    String message = StructSimpleValue.toString();
                    onReceiveLog(message);
                }

                // Call receive handler with deserialized value
                onReceive(StructSimpleValue);
                return true;
            }
            case (int)test.fbe.StructOptionalModel.fbeTypeConst:
            {
                // Deserialize the value from the FBE stream
                StructOptionalModel.attach(buffer, offset);
                assert StructOptionalModel.verify() : "test.StructOptional validation failed!";
                long deserialized = StructOptionalModel.deserialize(StructOptionalValue);
                assert (deserialized > 0) : "test.StructOptional deserialization failed!";

                // Log the value
                if (getLogging())
                {
                    String message = StructOptionalValue.toString();
                    onReceiveLog(message);
                }

                // Call receive handler with deserialized value
                onReceive(StructOptionalValue);
                return true;
            }
            case (int)test.fbe.StructNestedModel.fbeTypeConst:
            {
                // Deserialize the value from the FBE stream
                StructNestedModel.attach(buffer, offset);
                assert StructNestedModel.verify() : "test.StructNested validation failed!";
                long deserialized = StructNestedModel.deserialize(StructNestedValue);
                assert (deserialized > 0) : "test.StructNested deserialization failed!";

                // Log the value
                if (getLogging())
                {
                    String message = StructNestedValue.toString();
                    onReceiveLog(message);
                }

                // Call receive handler with deserialized value
                onReceive(StructNestedValue);
                return true;
            }
            case (int)test.fbe.StructBytesModel.fbeTypeConst:
            {
                // Deserialize the value from the FBE stream
                StructBytesModel.attach(buffer, offset);
                assert StructBytesModel.verify() : "test.StructBytes validation failed!";
                long deserialized = StructBytesModel.deserialize(StructBytesValue);
                assert (deserialized > 0) : "test.StructBytes deserialization failed!";

                // Log the value
                if (getLogging())
                {
                    String message = StructBytesValue.toString();
                    onReceiveLog(message);
                }

                // Call receive handler with deserialized value
                onReceive(StructBytesValue);
                return true;
            }
            case (int)test.fbe.StructArrayModel.fbeTypeConst:
            {
                // Deserialize the value from the FBE stream
                StructArrayModel.attach(buffer, offset);
                assert StructArrayModel.verify() : "test.StructArray validation failed!";
                long deserialized = StructArrayModel.deserialize(StructArrayValue);
                assert (deserialized > 0) : "test.StructArray deserialization failed!";

                // Log the value
                if (getLogging())
                {
                    String message = StructArrayValue.toString();
                    onReceiveLog(message);
                }

                // Call receive handler with deserialized value
                onReceive(StructArrayValue);
                return true;
            }
            case (int)test.fbe.StructVectorModel.fbeTypeConst:
            {
                // Deserialize the value from the FBE stream
                StructVectorModel.attach(buffer, offset);
                assert StructVectorModel.verify() : "test.StructVector validation failed!";
                long deserialized = StructVectorModel.deserialize(StructVectorValue);
                assert (deserialized > 0) : "test.StructVector deserialization failed!";

                // Log the value
                if (getLogging())
                {
                    String message = StructVectorValue.toString();
                    onReceiveLog(message);
                }

                // Call receive handler with deserialized value
                onReceive(StructVectorValue);
                return true;
            }
            case (int)test.fbe.StructListModel.fbeTypeConst:
            {
                // Deserialize the value from the FBE stream
                StructListModel.attach(buffer, offset);
                assert StructListModel.verify() : "test.StructList validation failed!";
                long deserialized = StructListModel.deserialize(StructListValue);
                assert (deserialized > 0) : "test.StructList deserialization failed!";

                // Log the value
                if (getLogging())
                {
                    String message = StructListValue.toString();
                    onReceiveLog(message);
                }

                // Call receive handler with deserialized value
                onReceive(StructListValue);
                return true;
            }
            case (int)test.fbe.StructSetModel.fbeTypeConst:
            {
                // Deserialize the value from the FBE stream
                StructSetModel.attach(buffer, offset);
                assert StructSetModel.verify() : "test.StructSet validation failed!";
                long deserialized = StructSetModel.deserialize(StructSetValue);
                assert (deserialized > 0) : "test.StructSet deserialization failed!";

                // Log the value
                if (getLogging())
                {
                    String message = StructSetValue.toString();
                    onReceiveLog(message);
                }

                // Call receive handler with deserialized value
                onReceive(StructSetValue);
                return true;
            }
            case (int)test.fbe.StructMapModel.fbeTypeConst:
            {
                // Deserialize the value from the FBE stream
                StructMapModel.attach(buffer, offset);
                assert StructMapModel.verify() : "test.StructMap validation failed!";
                long deserialized = StructMapModel.deserialize(StructMapValue);
                assert (deserialized > 0) : "test.StructMap deserialization failed!";

                // Log the value
                if (getLogging())
                {
                    String message = StructMapValue.toString();
                    onReceiveLog(message);
                }

                // Call receive handler with deserialized value
                onReceive(StructMapValue);
                return true;
            }
            case (int)test.fbe.StructHashModel.fbeTypeConst:
            {
                // Deserialize the value from the FBE stream
                StructHashModel.attach(buffer, offset);
                assert StructHashModel.verify() : "test.StructHash validation failed!";
                long deserialized = StructHashModel.deserialize(StructHashValue);
                assert (deserialized > 0) : "test.StructHash deserialization failed!";

                // Log the value
                if (getLogging())
                {
                    String message = StructHashValue.toString();
                    onReceiveLog(message);
                }

                // Call receive handler with deserialized value
                onReceive(StructHashValue);
                return true;
            }
            case (int)test.fbe.StructHashExModel.fbeTypeConst:
            {
                // Deserialize the value from the FBE stream
                StructHashExModel.attach(buffer, offset);
                assert StructHashExModel.verify() : "test.StructHashEx validation failed!";
                long deserialized = StructHashExModel.deserialize(StructHashExValue);
                assert (deserialized > 0) : "test.StructHashEx deserialization failed!";

                // Log the value
                if (getLogging())
                {
                    String message = StructHashExValue.toString();
                    onReceiveLog(message);
                }

                // Call receive handler with deserialized value
                onReceive(StructHashExValue);
                return true;
            }
        }

        if ((protoReceiver != null) && protoReceiver.onReceive(type, buffer, offset, size))
            return true;

        return false;
    }
}
