# leetcode
1. Idea leetcode plugin setting:

CodeFileName:
```
$!velocityTool.camelCaseName(${question.titleSlug})
```
CodeTemplate:
```

${question.content}

object $!velocityTool.camelCaseName(${question.titleSlug}) {

    def main(args: Array[String]): Unit = {
        // Solution.methodName()
        val solution = Solution

    }

      ${question.code}
  }
```
TemplateConstant:
```
${question.title}	question title	ex:Two Sum
${question.titleSlug}	question title slug 	ex:two-sum
${question.frontendQuestionId}	question serial number
${question.content}	question content
${question.code}	question code
$!velocityTool.camelCaseName(str)	transform str camel case
```

[image](https://github.com/merrily01/leetcode/blob/master/resources/images/1602496416008.jpg)