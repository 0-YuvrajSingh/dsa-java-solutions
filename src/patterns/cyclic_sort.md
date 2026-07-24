# Cyclic Sort Pattern

## When to Use
- Arrays with numbers in range [1, n]
- Find missing or duplicate number

## Template
```java
int i = 0;
while (i < n) {
    int correct = arr[i] - 1;
    if (arr[i] != arr[correct]) {
        swap(arr, i, correct);
    } else {
        i++;
    }
}
```

## Problems in Repo

| Problem | File | Difficulty |
|---------|------|------------|
| Cyclic Sort | sorting/CyclicSort | Easy |
| Missing Number | arrays/MissingNumber | Easy |
| Missing Number (LC) | arrays/MissingNumberLC | Easy |
| Repeat and Missing | arrays/RepeatAndMissing | Medium |
| Sort 012 | arrays/Sort012 | Medium |
