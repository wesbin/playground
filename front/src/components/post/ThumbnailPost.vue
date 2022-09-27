<script setup>
import {useRouter} from 'vue-router';

const props = defineProps({
  post: {
    required: true,
    type: Object,
  },
  onPostClicked: {
    required: true,
    type: Function
  }
})

const router = useRouter()
// todo path 를 변수로서 동작하게끔 만들어야 한다.
const clickThumbnail = () => {
  props.onPostClicked(props.post)
  // router.push(`/Comics/${props.post.title}`)
}
</script>

<template>
  <!-- todo 만화랑 음악, 하나의 ThumbnailPost 로 표현이 가능한가? -->
  <!-- todo 만화의 경우 특정 편을 보여줄수도 있지 않나? => 뭔가 크게 바뀌어야 될 수도 -->
  <!-- todo Board 에서는 일부 정보만 가져오고 -->
  <!-- todo 그걸로 ThubmnilPost 를 만들고 클릭 했을 때 새로운 페이지가 뜨면서 해당 Post 의 세부 정보를 가져오는 식으로? -->
  <div
    class="post"
    @click="clickThumbnail"
  >
    Image
    <div class="post-title">
      {{ post.title }}
    </div>
  </div>
</template>

<style lang="scss" scoped>
.post {
  display: flex;
  position: relative;
  flex-direction: column;
  flex: 0 0 100px;
  height: 100px;
  background-color: #c1c1c1;
  cursor: pointer;

  .post-title {
    position: absolute;
    bottom: 0;
    width: 100%;
    color: $WHITE-FONT;
    background-color: black;
    opacity: 30%;
    user-select: none;
  }
}
</style>