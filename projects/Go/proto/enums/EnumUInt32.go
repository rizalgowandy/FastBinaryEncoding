// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// Version: 1.1.0.0

package enums

import "encoding/json"
import "../fbe"

// Workaround for Go unused imports issue
var _ = fbe.Version

// EnumUInt32 enum
type EnumUInt32 uint32

// EnumUInt32 enum values
//noinspection GoSnakeCaseUsage
const (
    EnumUInt32_ENUM_VALUE_0 = EnumUInt32(0 + 0)
    EnumUInt32_ENUM_VALUE_1 = EnumUInt32(0 + 0)
    EnumUInt32_ENUM_VALUE_2 = EnumUInt32(0 + 1)
    EnumUInt32_ENUM_VALUE_3 = EnumUInt32(0xFFFFFFFE + 0)
    EnumUInt32_ENUM_VALUE_4 = EnumUInt32(0xFFFFFFFE + 1)
    EnumUInt32_ENUM_VALUE_5 = EnumUInt32(EnumUInt32_ENUM_VALUE_3)
)

// Create a new EnumUInt32 enum
func NewEnumUInt32() *EnumUInt32 {
    return new(EnumUInt32)
}

// Convert enum to string
func (e EnumUInt32) String() string {
    if e == EnumUInt32_ENUM_VALUE_0 {
        return "ENUM_VALUE_0"
    }
    if e == EnumUInt32_ENUM_VALUE_1 {
        return "ENUM_VALUE_1"
    }
    if e == EnumUInt32_ENUM_VALUE_2 {
        return "ENUM_VALUE_2"
    }
    if e == EnumUInt32_ENUM_VALUE_3 {
        return "ENUM_VALUE_3"
    }
    if e == EnumUInt32_ENUM_VALUE_4 {
        return "ENUM_VALUE_4"
    }
    if e == EnumUInt32_ENUM_VALUE_5 {
        return "ENUM_VALUE_5"
    }
    return "<unknown>"
}

// Convert enum to JSON
func (e EnumUInt32) MarshalJSON() ([]byte, error) {
    return json.Marshal(uint32(e))
}

// Convert JSON to enum
func (e *EnumUInt32) UnmarshalJSON(b []byte) error {
    var result uint32
    err := json.Unmarshal(b, &result)
    if err != nil {
        return err
    }
    *e = EnumUInt32(result)
    return nil
}