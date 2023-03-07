import csstype.AlignContent.Companion.center
import csstype.Position
import csstype.px
import csstype.rgb
import react.FC
import react.Props
import emotion.react.css
import kotlinx.browser.window
import react.dom.html.InputType
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.input
import react.dom.html.ReactHTML.li
import react.dom.html.ReactHTML.ul
import react.useState
import emotion.react.css
import react.dom.html.ReactHTML
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.h3
import react.dom.html.ReactHTML.img
import react.dom.html.ReactHTML.table
import react.dom.html.ReactHTML.td
import react.dom.html.ReactHTML.thead
import react.dom.html.ReactHTML.tr


external interface WelcomeProps : Props {
    var name: String
    var selectedMenu: MenuItems?
}
class MenuItems(var menuname:String)
val menulist=listOf(MenuItems("Client Management"),
    MenuItems("Underwriting"),
    MenuItems("Claims"),
    MenuItems("Accounts"),
    MenuItems("System Setting"),null
)

val Welcome = FC<WelcomeProps> { props ->
    var name by useState(props.name)
    var currentVideo: MenuItems? by useState(null)



    div {
        css {
            padding = 5.px
            backgroundColor = rgb(8, 97, 22)
            color = rgb(56, 246, 137)
        }
        +"Hello, $name"
    }
    div{
        css {
            position = Position.absolute
            top = 10.px
            left = 3.px
        }
        li{
           menulist.forEach { men ->

               ul{
                   a{
                       if (men != null) {
                           + men.menuname
                       }
                   }
                   onClick={
                       if (men != null) {
                           name=men.menuname
                       }

                       //window.alert(" Clicked ${men.menuname}")
                   }
               }
           }
        }
    }


    div{
        css {
            position = Position.absolute
            top = 40.px
            right = 10.px
        }
        input {
            css {
                fontSize = 14.px
            }
            type = InputType.text
            value = name

            onChange = { event ->
                name = event.target.value
            }
        }
    }
    div {
        css {
            position = Position.absolute
            top = 50.px
            right = 80.px
        }
        h3 {
            +"You are at $name"
        }
        img {

            src = "https://media.istockphoto.com/id/1352603244/photo/shot-of-an-unrecognizable-businessman-working-on-his-laptop-in-the-office.jpg?s=1024x1024&w=is&k=20&c=mTABddPRSU1r_hCBpknMjJbCIrJAicjjXGSU42rx-YI="
            onClick={window.alert("Click me $name")}
        }
    }


}