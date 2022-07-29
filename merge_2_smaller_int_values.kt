const val VIEW_TYPE_MAX: Int = 0b11111111
const val POSITION_MASK: Int = 0b00000000111111111111111111111111

fun combineViewType(position: Int, viewType: Int): Int {
    if (position !in 0..POSITION_MASK) throw IllegalArgumentException("err: position !in 0..$POSITION_MASK")
    if (viewType !in 0..VIEW_TYPE_MAX) throw IllegalArgumentException("err: viewType !in 0..$VIEW_TYPE_MAX")
    return viewType shl POSITION_MASK.countOneBits() or position
}

fun getPosition(combinedViewType: Int): Int {
    return combinedViewType and POSITION_MASK
}

fun getViewType(combinedViewType: Int): Int {
    return combinedViewType ushr POSITION_MASK.countOneBits()
}
