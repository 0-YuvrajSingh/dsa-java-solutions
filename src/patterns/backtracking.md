# Backtracking Pattern

## When to Use
- Permutations, Combinations, Subsets
- Constraint-based problems (N-Queens, Sudoku)
- Maze solving

## Template
```java
void backtrack(int[] nums, List<Integer> path, List<List<Integer>> result, boolean[] used) {
    if (path.size() == nums.length) {
        result.add(new ArrayList<>(path));
        return;
    }
    for (int i = 0; i < nums.length; i++) {
        if (used[i]) continue;
        used[i] = true;
        path.add(nums[i]);
        backtrack(nums, path, result, used);
        path.remove(path.size() - 1);
        used[i] = false;
    }
}
```

## Problems in Repo

| Problem | File | Difficulty |
|---------|------|------------|
| Subsets 1 | recursion_backtracking/SubSets1 | Medium |
| Subsets 2 | recursion_backtracking/SubSets2 | Medium |
| Subsequences with Sum K | recursion_backtracking/SubsequencesWithSumK | Medium |
| If Any Subsequence with Sum K | recursion_backtracking/IfAnySubsequenceWithSumK | Easy |
| Good Numbers | recursion_backtracking/GoodNumbers | Medium |
| N-Queens | recursion_backtracking/NQueensSolver | Hard |
| Sudoku Solver | recursion_backtracking/SudokuSolver | Hard |
| Tic Tac Toe | recursion_backtracking/TicTacToe | Medium |
| Rat in a Maze | recursion_backtracking/RatInMazeSolver | Medium |
