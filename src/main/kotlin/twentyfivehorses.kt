
/** Assign each horse a unique ordinal number. */
typealias Horse = Int

/** Know which horses have slower or faster. */
data class Score(
    val fasterThan: Set<Horse>,
    val slowerThan: Set<Horse>
)

/** State consists of the score of each horse. */
data class State(
    val scores: Array<Score>
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as State
        return scores.contentEquals(other.scores)
    }

    override fun hashCode(): Int {
        return scores.contentHashCode()
    }
}

/** Order of a subset of horses. */
typealias RaceResult = Array<Horse>

fun update(
    state: State,
    raceResult: RaceResult
): State {
    TODO("not implemented")
}

fun main() {
    println("hello world")
}
