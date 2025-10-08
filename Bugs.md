Uninitialized HashMap – didn’t initialize guesses in the constructor → causes a NullPointerException when adding guesses.

Case-sensitivity issue – only checks uppercase in the dictionary → valid lowercase words get rejected.

Null secret word – if startGame() isn’t called, secretWord is null, causing crashes in Feedback.

Null map usage – this.guesses.put() runs on a null guesses map.

Off-by-one guess count – increments guesses before checking if game should end → one extra guess allowed.

Boundary error in game-over – guessNum > 5 ends game after 5 instead of 6 guesses.

Wrong initial guess count – starts at 1 instead of 0, losing one turn immediately.

Forgot reset – doesn’t reset Validation when starting a new game → could end instantly from old data.

Null check missing – Feedback doesn’t verify secretWord is non-null before accessing characters.