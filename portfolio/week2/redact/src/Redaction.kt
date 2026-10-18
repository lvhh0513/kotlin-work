// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
fun redact(document : String, text: String, character: Char = 'X'): String{
    val length = text.length
    val char_string = character.toString()
    val redacted = char_string.repeat(length)
    
    return document.replace(text, redacted)
}