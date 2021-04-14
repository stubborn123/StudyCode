class myDecorator(object):
    def __init__(self, fn):
        print("inside myDecorator.__init__()")
        self.fn = fn

    def __call__(self):
        self.fn()
        print("inside myDecorator.__call__()")


@myDecorator
def aFunction():
    print("inside aFunction()")


print("Finished decorating aFunction()")

#py3 的类方式的装饰器
aFunction()

# 输出：
# inside myDecorator.__init__()
# Finished decorating aFunction()
# inside aFunction()
# inside myDecorator.__call__()