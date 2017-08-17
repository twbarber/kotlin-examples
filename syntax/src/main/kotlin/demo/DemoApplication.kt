package demo

import java.util.concurrent.ThreadLocalRandom

class SyntaxDemo {

}

fun coinFlip() : Boolean = ThreadLocalRandom.current().nextInt(0, 101) > 50