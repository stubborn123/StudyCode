#一个具有实际意义的url注册函数示例


class MyApp():
    def __init__(self):
        self.func_map = {}

    def register(self, name):
        def func_wrapper(func):
            self.func_map[name] = func
            return func

        return func_wrapper

    def call_method(self, name=None):
        func = self.func_map.get(name, None)
        if func is None:
            raise Exception("No function registered against - " + str(name))
        return func()


app = MyApp()


@app.register('/')
def main_page_func():
    return "This is the main page."


@app.register('/next_page')
def next_page_func():
    return "This is the next page."


print(app.call_method('/'))
print(app.call_method('/next_page'))