// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.2.0.0

package test;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.ByteBuffer;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

import fbe.*;
import proto.*;

public enum FlagsEmptyEnum
{
    ;

    private int value;

    FlagsEmptyEnum(int value) { this.value = (int)value; }
    FlagsEmptyEnum(FlagsEmptyEnum value) { this.value = value.value; }

    public int getRaw() { return value; }

    public static FlagsEmptyEnum mapValue(int value) { return mapping.get(value); }

    public boolean hasFlags(int flags) { return (((value & flags) != 0) && ((value & flags) == flags)); }
    public boolean hasFlags(FlagsEmptyEnum flags) { return hasFlags(flags.value); }

    public EnumSet<FlagsEmptyEnum> getAllSet() { return EnumSet.allOf(FlagsEmptyEnum.class); }
    public EnumSet<FlagsEmptyEnum> getNoneSet() { return EnumSet.noneOf(FlagsEmptyEnum.class); }
    public EnumSet<FlagsEmptyEnum> getCurrentSet()
    {
        EnumSet<FlagsEmptyEnum> result = EnumSet.noneOf(FlagsEmptyEnum.class);
        return result;
    }

    @Override
    public String toString()
    {
        var sb = new StringBuilder();
        boolean first = true;
        return sb.toString();
    }

    private static final Map<Integer, FlagsEmptyEnum> mapping = new HashMap<>();
    static
    {
        for (var value : FlagsEmptyEnum.values())
            mapping.put(value.value, value);
    }
}
