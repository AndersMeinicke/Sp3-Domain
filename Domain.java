@startuml
'https://plantuml.com/object-diagram
object Hold
object Turnering
object KnockOutTurnering
object PointTurnering
object KampProgram
object Point
object Målscore
object Spiller
Turnering <|-- Point
Turnering <|-- Målscore
KampProgram <|-- KnockOutTurnering
KampProgram <|-- PointTurnering
Turnering <|-- KampProgram
Turnering o-- "16" Hold
Hold o-- "2.." Spiller



@enduml