package kr.vanilage.main.database

class Table(vararg column : Any) {
    val rows = ArrayList<Row>()
    val columns = column.clone()
}