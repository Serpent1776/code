"""
Jack Hemling
2/18/2022
Homework F-1
This is my own work
"""
from Counter import Counter
"""
TheBigTest() is a function that tests the Counter class to the fullest, excluding the count setter and the getters.
Reasons for such:
the Count setter and the getters obviously work as intended
"""
def TheBigTest():
 counterz = [Counter(1, 3), Counter(1, 3)] #list for easy access
 a = counterz[0] == counterz[1]
 print("Test Start: " + str(a)) #part one: startup done
 print(counterz[0])
 print(counterz[1])
 counterz[0].inc()
 counterz[1].inc()
 a = counterz[0] == counterz[1]
 print("they are increased now by 3: " + str(a)) #part two: incs done
 counterz[0].setStep(5)
 counterz[1].setStep(5)
 counterz[0].dec()
 counterz[1].dec()
 a = counterz[0] == counterz[1]
 print("they are decreased now by 5: " + str(a)) #part three: decs done
 print(counterz[0])
 print(counterz[1])
 counterz[0].reset()
 counterz[1].reset()
 a = counterz[0] == counterz[1]
 print("the counters are reset: " + str(a)) #part four: reset done
 counterz[0].resetStep()
 counterz[1].resetStep()
 counterz[0].inc()
 a = counterz[0] == counterz[1]
 print("step reset and increment for first only was done: " + str(a)) #part five: resetStep with uneven finish done
 print(counterz[0])
 print(counterz[1])
 print("Test Complete") 
 

TheBigTest()