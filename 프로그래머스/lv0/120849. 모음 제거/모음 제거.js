function solution(my_string) {
    const str = 'aeiou';
    let NewString = my_string.split('').filter((el)=>(!str.includes(el))).join('');
    return NewString;
}