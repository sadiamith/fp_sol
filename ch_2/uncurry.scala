object uncurry {
    //takes in a, b type, returns c
    def uncurry[A,B,C](f: A => B => C): (A, B) => C = {
        (a: A, b: B) => f(a:A)(b:B) 
    }
}