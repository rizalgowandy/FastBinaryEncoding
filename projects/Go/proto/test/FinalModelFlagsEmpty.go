// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.2.0.0

package test

import "errors"
import "../fbe"

// Fast Binary Encoding FlagsEmpty final model
type FinalModelFlagsEmpty struct {
    // Final model buffer
    buffer *fbe.Buffer
    // Final model buffer offset
    offset int
}

// Create a new FlagsEmpty final model
func NewFinalModelFlagsEmpty(buffer *fbe.Buffer, offset int) *FinalModelFlagsEmpty {
    return &FinalModelFlagsEmpty{buffer: buffer, offset: offset}
}

// Get the allocation size
func (fm *FinalModelFlagsEmpty) FBEAllocationSize(value *FlagsEmpty) int { return fm.FBESize() }

// Get the final size
func (fm *FinalModelFlagsEmpty) FBESize() int { return 4 }

// Get the final offset
func (fm *FinalModelFlagsEmpty) FBEOffset() int { return fm.offset }
// Set the final offset
func (fm *FinalModelFlagsEmpty) SetFBEOffset(value int) { fm.offset = value }

// Shift the current final offset
func (fm *FinalModelFlagsEmpty) FBEShift(size int) { fm.offset += size }
// Unshift the current final offset
func (fm *FinalModelFlagsEmpty) FBEUnshift(size int) { fm.offset -= size }

// Check if the value is valid
func (fm *FinalModelFlagsEmpty) Verify() int {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return fbe.MaxInt
    }

    return fm.FBESize()
}

// Get the value
func (fm *FinalModelFlagsEmpty) Get() (*FlagsEmpty, int, error) {
    var value FlagsEmpty
    size, err := fm.GetValueDefault(&value, FlagsEmpty(0))
    return &value, size, err
}

// Get the value with provided default value
func (fm *FinalModelFlagsEmpty) GetDefault(defaults FlagsEmpty) (*FlagsEmpty, int, error) {
    var value FlagsEmpty
    size, err := fm.GetValueDefault(&value, defaults)
    return &value, size, err
}

// Get the value by the given pointer
func (fm *FinalModelFlagsEmpty) GetValue(value *FlagsEmpty) (int, error) {
    return fm.GetValueDefault(value, FlagsEmpty(0))
}

// Get the value by the given pointer with provided default value
func (fm *FinalModelFlagsEmpty) GetValueDefault(value *FlagsEmpty, defaults FlagsEmpty) (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        *value = defaults
        return 0, errors.New("model is broken")
    }

    *value = FlagsEmpty(fbe.ReadInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset()))
    return fm.FBESize(), nil
}

// Set the value by the given pointer
func (fm *FinalModelFlagsEmpty) Set(value *FlagsEmpty) (int, error) {
    return fm.SetValue(*value)
}

// Set the value
func (fm *FinalModelFlagsEmpty) SetValue(value FlagsEmpty) (int, error) {
    if (fm.buffer.Offset() + fm.FBEOffset() + fm.FBESize()) > fm.buffer.Size() {
        return 0, errors.New("model is broken")
    }

    fbe.WriteInt32(fm.buffer.Data(), fm.buffer.Offset() + fm.FBEOffset(), int32(value))
    return fm.FBESize(), nil
}
