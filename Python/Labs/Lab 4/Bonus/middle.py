import pytypes
from typing import Tuple
class Middle:
    @pytypes.typechecked
    def middle() -> Tuple:
        raise NotImplementedError("Should have implemented this")
