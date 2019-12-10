# leetcode
1. Idea leetcode plugin setting:

```
[$!{question.frontendQuestionId}]$!velocityTool.camelCaseName(${question.titleSlug}) 

```
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