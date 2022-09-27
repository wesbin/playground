<script setup>
import {onBeforeMount, reactive} from 'vue';
import axios from 'axios';

const props = defineProps({
  musicId: String,
})

const musicInfo = reactive({})
onBeforeMount(async () => {
  const {data} = await axios.get(`http://localhost:8081/musics/${props.musicId}`)
  Object.assign(musicInfo, data)
})
</script>

<template>
<!-- todo 영역 나누기 -->
  <div>
    {{ musicInfo }}
  </div>
</template>

<style scoped>

</style>