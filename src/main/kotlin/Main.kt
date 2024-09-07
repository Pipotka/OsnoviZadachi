fun main(args: Array<String>)
{
    print("Введите строку: ");
    var str = readln();
    var result = "";
    var countChar = 1
    var previousChar = str [0]
    for (i in 1 .. str.length - 1)
    {
        if (previousChar == str[i])
        {
            countChar +=1
            previousChar =str[i]
        }
        else
        {
            if (countChar > 1)
            {
                result = result + countChar + previousChar
            }
            else
            {
                result = result + previousChar
            }
            countChar = 1
            previousChar = str[i]
        }
    }

    if ( countChar > 1)
    {
        result = result + countChar + previousChar

    }
    else
    {
        result = result + previousChar
    }
    print(str+countChar);

}

