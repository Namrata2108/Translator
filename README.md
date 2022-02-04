# Translator
## Project walkthrough

In this project I have created an API which translates words from English to French or Spanish and vice-versa. For this particular project I have not used any external translator API but rather created my own list of word translation pair which I have used for translation.

### Translation preparation:
- I had to create translation pairs for all possible combinations of English, Spanish and French.
- I created a CSV which had 6 sheets in it and it contained the translation pairs of 10000 words.
- Made an enum named language, defining English as en, Spanish as es and French as fr.
- Defined two methods getOrigin and getDestination, where origin is the language from which to translate and destination is the language to be translated into. 

### Translation method:
- I created an interface named translate in LanguageMap class
- Here I am reading the CSV file and making a dictionary as a hashmap where I'm inputting the word and its translation into a hashmap
- Made a Demo class which was extended from LanguageMap class.
- In the method translate inside Demo, I split the strings by the punctuation marks
- In show method I had the input strings in English to translate and then I made 2 string lists as well for French text and Spanish text. 
- The outcome I got on translating the text from English to French was added to the French list and similarly for Spanish text list
- Once the string was translated I joined it back together

### Checking translation:
- The output that was added to the French lists and Spanish lists was to cross check the translation output and its accuracy
- Once I added the input to both lists I'm giving these lists as input for the remaining translation

### Output:
- I simply printed the output in the driver class by calling the show method in Demo class.
- I have pasted the output in the Driver class for reference
