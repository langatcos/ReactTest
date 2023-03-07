import csstype.AlignContent
import csstype.Position
import csstype.px
import emotion.react.css
import react.FC
import react.Props
import react.dom.html.ReactHTML
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.table
import react.dom.html.ReactHTML.tbody
import react.dom.html.ReactHTML.td
import react.dom.html.ReactHTML.thead
import react.dom.html.ReactHTML.tr
import react.useState

external interface ClientMod: Props {
    var name:MenuItems?
}
val clientModule= FC<ClientMod>{props->
    div {
        css {
            position = Position.absolute
            top = 25.px
            right = 260.px
            AlignContent.center
        }
        ReactHTML.h3 {
            props.name
        }
        ReactHTML.img {
            src = "https://via.placeholder.com/640x360.png?text=Video+Player+Placeholder"
        }
    }
}
