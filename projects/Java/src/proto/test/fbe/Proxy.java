// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.2.0.0

package test.fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.ByteBuffer;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

import fbe.*;
import test.*;

// Fast Binary Encoding test proxy
public class Proxy extends fbe.Receiver
{
    // Imported proxy
    public proto.fbe.Proxy protoProxy;

    // Proxy models accessors
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
    private final StructEmptyModel StructEmptyModel;

    public Proxy()
    {
        super(false);
        protoProxy = new proto.fbe.Proxy(getBuffer());
        StructSimpleModel = new StructSimpleModel();
        StructOptionalModel = new StructOptionalModel();
        StructNestedModel = new StructNestedModel();
        StructBytesModel = new StructBytesModel();
        StructArrayModel = new StructArrayModel();
        StructVectorModel = new StructVectorModel();
        StructListModel = new StructListModel();
        StructSetModel = new StructSetModel();
        StructMapModel = new StructMapModel();
        StructHashModel = new StructHashModel();
        StructHashExModel = new StructHashExModel();
        StructEmptyModel = new StructEmptyModel();
    }
    public Proxy(Buffer buffer)
    {
        super(buffer, false);
        protoProxy = new proto.fbe.Proxy(getBuffer());
        StructSimpleModel = new StructSimpleModel();
        StructOptionalModel = new StructOptionalModel();
        StructNestedModel = new StructNestedModel();
        StructBytesModel = new StructBytesModel();
        StructArrayModel = new StructArrayModel();
        StructVectorModel = new StructVectorModel();
        StructListModel = new StructListModel();
        StructSetModel = new StructSetModel();
        StructMapModel = new StructMapModel();
        StructHashModel = new StructHashModel();
        StructHashExModel = new StructHashExModel();
        StructEmptyModel = new StructEmptyModel();
    }

    // Proxy handlers
    protected void onProxy(StructSimpleModel model, long type, byte[] buffer, long offset, long size) {}
    protected void onProxy(StructOptionalModel model, long type, byte[] buffer, long offset, long size) {}
    protected void onProxy(StructNestedModel model, long type, byte[] buffer, long offset, long size) {}
    protected void onProxy(StructBytesModel model, long type, byte[] buffer, long offset, long size) {}
    protected void onProxy(StructArrayModel model, long type, byte[] buffer, long offset, long size) {}
    protected void onProxy(StructVectorModel model, long type, byte[] buffer, long offset, long size) {}
    protected void onProxy(StructListModel model, long type, byte[] buffer, long offset, long size) {}
    protected void onProxy(StructSetModel model, long type, byte[] buffer, long offset, long size) {}
    protected void onProxy(StructMapModel model, long type, byte[] buffer, long offset, long size) {}
    protected void onProxy(StructHashModel model, long type, byte[] buffer, long offset, long size) {}
    protected void onProxy(StructHashExModel model, long type, byte[] buffer, long offset, long size) {}
    protected void onProxy(StructEmptyModel model, long type, byte[] buffer, long offset, long size) {}

    @Override
    public boolean onReceive(long type, byte[] buffer, long offset, long size)
    {
        switch ((int)type)
        {
            case (int)test.fbe.StructSimpleModel.fbeTypeConst:
            {
                // Attach the FBE stream to the proxy model
                StructSimpleModel.attach(buffer, offset);
                assert StructSimpleModel.verify() : "test.StructSimple validation failed!";

                // Call proxy handler
                onProxy(StructSimpleModel, type, buffer, offset, size);
                return true;
            }
            case (int)test.fbe.StructOptionalModel.fbeTypeConst:
            {
                // Attach the FBE stream to the proxy model
                StructOptionalModel.attach(buffer, offset);
                assert StructOptionalModel.verify() : "test.StructOptional validation failed!";

                // Call proxy handler
                onProxy(StructOptionalModel, type, buffer, offset, size);
                return true;
            }
            case (int)test.fbe.StructNestedModel.fbeTypeConst:
            {
                // Attach the FBE stream to the proxy model
                StructNestedModel.attach(buffer, offset);
                assert StructNestedModel.verify() : "test.StructNested validation failed!";

                // Call proxy handler
                onProxy(StructNestedModel, type, buffer, offset, size);
                return true;
            }
            case (int)test.fbe.StructBytesModel.fbeTypeConst:
            {
                // Attach the FBE stream to the proxy model
                StructBytesModel.attach(buffer, offset);
                assert StructBytesModel.verify() : "test.StructBytes validation failed!";

                // Call proxy handler
                onProxy(StructBytesModel, type, buffer, offset, size);
                return true;
            }
            case (int)test.fbe.StructArrayModel.fbeTypeConst:
            {
                // Attach the FBE stream to the proxy model
                StructArrayModel.attach(buffer, offset);
                assert StructArrayModel.verify() : "test.StructArray validation failed!";

                // Call proxy handler
                onProxy(StructArrayModel, type, buffer, offset, size);
                return true;
            }
            case (int)test.fbe.StructVectorModel.fbeTypeConst:
            {
                // Attach the FBE stream to the proxy model
                StructVectorModel.attach(buffer, offset);
                assert StructVectorModel.verify() : "test.StructVector validation failed!";

                // Call proxy handler
                onProxy(StructVectorModel, type, buffer, offset, size);
                return true;
            }
            case (int)test.fbe.StructListModel.fbeTypeConst:
            {
                // Attach the FBE stream to the proxy model
                StructListModel.attach(buffer, offset);
                assert StructListModel.verify() : "test.StructList validation failed!";

                // Call proxy handler
                onProxy(StructListModel, type, buffer, offset, size);
                return true;
            }
            case (int)test.fbe.StructSetModel.fbeTypeConst:
            {
                // Attach the FBE stream to the proxy model
                StructSetModel.attach(buffer, offset);
                assert StructSetModel.verify() : "test.StructSet validation failed!";

                // Call proxy handler
                onProxy(StructSetModel, type, buffer, offset, size);
                return true;
            }
            case (int)test.fbe.StructMapModel.fbeTypeConst:
            {
                // Attach the FBE stream to the proxy model
                StructMapModel.attach(buffer, offset);
                assert StructMapModel.verify() : "test.StructMap validation failed!";

                // Call proxy handler
                onProxy(StructMapModel, type, buffer, offset, size);
                return true;
            }
            case (int)test.fbe.StructHashModel.fbeTypeConst:
            {
                // Attach the FBE stream to the proxy model
                StructHashModel.attach(buffer, offset);
                assert StructHashModel.verify() : "test.StructHash validation failed!";

                // Call proxy handler
                onProxy(StructHashModel, type, buffer, offset, size);
                return true;
            }
            case (int)test.fbe.StructHashExModel.fbeTypeConst:
            {
                // Attach the FBE stream to the proxy model
                StructHashExModel.attach(buffer, offset);
                assert StructHashExModel.verify() : "test.StructHashEx validation failed!";

                // Call proxy handler
                onProxy(StructHashExModel, type, buffer, offset, size);
                return true;
            }
            case (int)test.fbe.StructEmptyModel.fbeTypeConst:
            {
                // Attach the FBE stream to the proxy model
                StructEmptyModel.attach(buffer, offset);
                assert StructEmptyModel.verify() : "test.StructEmpty validation failed!";

                // Call proxy handler
                onProxy(StructEmptyModel, type, buffer, offset, size);
                return true;
            }
        }

        if ((protoProxy != null) && protoProxy.onReceive(type, buffer, offset, size))
            return true;

        return false;
    }
}
