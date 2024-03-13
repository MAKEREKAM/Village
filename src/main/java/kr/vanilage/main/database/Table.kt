package kr.vanilage.main.database

class Table(vararg columnTypes : Any) {
    val rows = ArrayList<Row>()
    val columns = ArrayList<Any>()
}