# Bit Manipulation Pattern

## When to Use
- XOR properties (a^a=0, a^0=a)
- Check/set/clear/toggle bits
- Subset generation via bitmask

## Common Tricks
```java
n & (n - 1)        // clear lowest set bit
n & (-n)           // isolate lowest set bit
1 << i             // set i-th bit
n ^ (1 << i)       // toggle i-th bit
n | (1 << i)       // set i-th bit
n & ~(1 << i)      // clear i-th bit
```

## Problems in Repo

| Problem | File | Difficulty |
|---------|------|------------|
| Check Power of Two | bit_manipulation/CheckPowerOfTwo | Easy |
| Count Set Bits | bit_manipulation/CountSetBits | Easy |
| Single Number | bit_manipulation/SingleNumber | Easy |
| Single Number II | bit_manipulation/SingleNumberII | Medium |
| Single Number III | bit_manipulation/SingleNumberIII | Medium |
| Subsets Using Bitmask | bit_manipulation/SubsetsUsingBitmask | Medium |
| Xor of Range | bit_manipulation/XorOfRange | Easy-Medium |
| Divide Two Integers | bit_manipulation/DivideTwoIntegers | Hard |
| Xor K | arrays/XorK | Medium |
